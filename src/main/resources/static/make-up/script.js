let body = document.querySelector("body");
let switchMode = document.querySelector(".switch-mode");
let logo = document.querySelector(".logo");
let tools = document.querySelectorAll(".tools");
let onDarkMode = false;

switchMode.addEventListener("click", function () {
    if (onDarkMode == false) {
        body.style.background = "#fff";
        body.style.color = "#000";
        logo.style.filter = "brightness(0) invert(0)";
        tools.forEach(tools => {
            tools.style.background = "rgb(230,230,230)"
        });
        onDarkMode = true;
    } else {
        body.style.background = "#000";
        body.style.color = "#fff";
        logo.style.filter = "brightness(0) invert(1)";
        tools.forEach(tools => {
            tools.style.background = "rgb(65,65,65)"
        });
        onDarkMode = false;
    }
})