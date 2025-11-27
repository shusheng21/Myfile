// Typora Git 同步脚本
const {exec} = require('child_process');
const path = require('path');
const fs = require('fs');

// 获取脚本所在目录
const scriptDir = path.dirname(__filename);
const batScriptPath = path.join(scriptDir, 'GitSync.bat');

// 创建日志函数
function log(message) {
    const timestamp = new Date().toLocaleString();
    const logMessage = `[${timestamp}] ${message}\n`;
    console.log(`[Typora-Git] ${logMessage}`);
    
    // 可选：将日志写入文件
    try {
        const logFile = path.join(scriptDir, 'typora-git.log');
        fs.appendFileSync(logFile, logMessage);
    } catch (e) {
        // 忽略日志文件写入错误
    }
}

log("Typora-Git 同步脚本已加载");

// 注册命令
module.exports = {
    commands: {
        "Git Sync": function() {
            log("Git Sync 命令被触发");
            
            try {
                const filePath = this.getFilePath();
                if (!filePath) {
                    log("错误：未获取到文件路径");
                    this.flashMessage && this.flashMessage("❌ 请先保存文件", 2000);
                    return;
                }
                
                // 获取文件所在目录
                const fileDir = path.dirname(filePath);
                
                log(`开始同步，文件目录: ${fileDir}`);
                
                // 显示提示
                this.flashMessage && this.flashMessage("🔄 正在同步到 GitHub...", 3000);
                
                // 执行同步脚本
                exec(`"${batScriptPath}"`, { 
                    cwd: fileDir 
                }, (error, stdout, stderr) => {
                    if (error) {
                        log(`同步失败: ${error.message}`);
                        this.flashMessage && this.flashMessage("❌ 同步失败", 2000);
                    } else {
                        log("同步成功完成");
                        this.flashMessage && this.flashMessage("✅ 已同步到 GitHub", 2000);
                    }
                    
                    // 在控制台显示输出
                    if (stdout) {
                        console.log("Git输出:", stdout);
                    }
                    if (stderr) {
                        console.error("Git错误:", stderr);
                    }
                });
                
            } catch (error) {
                log(`执行错误: ${error.message}`);
                this.flashMessage && this.flashMessage("❌ 执行错误", 2000);
            }
        }
    }
};