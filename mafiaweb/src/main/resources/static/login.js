let username;
let practiceUsername = "granted"  // making this username to automatically send user to index.html when login button is clicked  NO PASSWORD REQUIRED"//
let emptyUsername = (""); 
let password;




document.getElementById("loginBtn").onclick = function(){

    username = document.getElementById("userId").value;

    if ( username == emptyUsername || username.includes(" ")){ 
        window.alert("You must enter a valid username without any spaces included. Example: JacobLaw223");
    }

    else if (username == practiceUsername){
        window.location.href = "index.html";

    }
    else{
        username = username.trim().charAt(0).toUpperCase() + username.trim().slice(1).toLowerCase();
        console.log(username); 
    }

    

    




}



 