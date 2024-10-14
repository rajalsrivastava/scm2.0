// console.log("Script loaded");

// //change theme work
// let currentTheme=getTheme();
// //initial -->
// changeTheme()

// //TODO:
// function changeTheme(){
    

//     //set to web page
//     changePageTheme(currentTheme,currentTheme);

//     //set the listener to change theme button
//     const changeThemeButton=document.querySelector('#theme_change_button');
    

//     const oldTheme=currentTheme;
//     changeThemeButton.addEventListener("click", (event) => {
      
//         console.log("change theme button clicked");
        
//         if(currentTheme == "dark"){
//             //theme to light
//             currentTheme="light";
//         }
//         else{
//             //theme to dark
//             currentTheme="dark";
//         }

//         changePageTheme(currentTheme,oldTheme);
//     });
//     //end of listener
// }

// //set theme to localstorage

// function setTheme(theme){
//     localStorage.setItem("theme",theme);
// }
// //get theme from localstorage
// function getTheme(){
//     let theme=localStorage.getItem("theme");
//     return theme ? theme:"light";
// }

// //change current page theme
// function changePageTheme(theme,oldTheme){
//     //localstorage mein update karenge
//     setTheme(currentTheme);
//     //remove the current theme
//     document.querySelector("html").classList.remove(oldTheme);
//     //set the current theme
//     document.querySelector("html").classList.add(theme);

//     //change the text of button
//     document
//     .querySelector("#theme_change_button")
//     .querySelector("span").textContent = theme == "light"?"Dark":"Light";
// }

// //change page change theme

console.log("Script loaded");

//change theme work
let currentTheme = getTheme();
//initial -->


document.addEventListener('DOMContentLoaded', () =>{
    changeTheme();
})

//TODO:
function changeTheme() {

    //set to web page
    changePageTheme(currentTheme, currentTheme);

    //set the listener to change theme button
    const changeThemeButton = document.querySelector('#theme_change_button');

    changeThemeButton.addEventListener("click", (event) => {

        console.log("change theme button clicked");
        
        // Store the old theme before changing
        const oldTheme = currentTheme;

        // Toggle between light and dark themes
        if (currentTheme == "dark") {
            currentTheme = "light";
        } else {
            currentTheme = "dark";
        }

        // Apply the new theme and update the page
        changePageTheme(currentTheme, oldTheme);
    });
    //end of listener
}

//set theme to localstorage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

//get theme from localstorage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}

//change current page theme
function changePageTheme(theme, oldTheme) {
    // Update theme in localStorage
    setTheme(currentTheme);

    // Remove the old theme class from the HTML element
    document.querySelector("html").classList.remove(oldTheme);

    // Add the new theme class to the HTML element
    document.querySelector("html").classList.add(theme);

    // Change the text of the button based on the current theme
    document
        .querySelector("#theme_change_button")
        .querySelector("span").textContent = theme == "light" ? "Dark" : "Light";
}
