let adminName = document.getElementById('nameUserConnect');
let adminPassword = document.getElementById('passwordUserConnect');
let validation = document.getElementById('connectButton');
 
validation.addEventListener('click', adminConnect);
window.addEventListener('load', redirectionAdmin);
  
ADMIN_NAME = "admin";
ADMIN_PASSWORD = "admin";
function adminConnect(){

    if ((adminName.value == ADMIN_NAME) && (adminPassword.value == ADMIN_PASSWORD)) {
        //connexion réussie
        document.location.href="adminFonctionnality.html";
        sessionStorage.setItem("log","admin");
    }else{
        //connexion échouée
        alert("you're not an admin");
    }
}

function redirectionAdmin() {
    statuLog = this.sessionStorage.getItem("log");
    if (this.statuLog == "admin") {
        this.document.location.href="adminFonctionnality.html";
    }
  }
function disconnect(){
    sessionStorage.removeItem('log');
    document.location.href="logInPage.html"
}