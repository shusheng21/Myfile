// 使用 module.exports 而不是 exports
module.exports = {
    onSave: function(cm) {
        console.log("新的 onSave 事件被触发！");
        
        // 测试代码：在桌面创建文件
        const fs = require('fs');
        const path = require('path');
        const testFile = path.join(require('os').homedir(), 'Desktop', 'typora_test.txt');
        fs.appendFileSync(testFile, `新的保存时间: ${new Date().toISOString()}\n`);
        
        // 实际同步代码
        const filePath = cm.getFilePath();
        if (filePath) {
            const {exec} = require("child_process");
            exec(`"E:\\Myfile\\GitSync.bat" "${filePath}"`);
        }
    }
};
const {exec} = require('child_process');

const batFile = 'E:/Myfile/GitSync.bat';

let working = false;

function gitSync(e) {
    if (working) {
        return;
    }

    if (e.type !== 'load' && !(e.altKey && (e.key === 's' || e.key === 'S'))) {
        return
    }

    if (e.altKey && (e.key === 's' || e.key === 'S')) {
        e.preventDefault();
    }

    working = true;

    exec(batFile, (error, stdout, stderr) => {
        working = false;

        if (error) {
            message(error.message);
            return;
        }

        if (!(e.altKey && (e.key === 's' || e.key === 'S'))) {
            return;
        }
        message(stdout);
    });
}

function message(msg) {
    showDialog({message: msg});
}

window.addEventListener('load', gitSync);
window.addEventListener('keydown', gitSync);