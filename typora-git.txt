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