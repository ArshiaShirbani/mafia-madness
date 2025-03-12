const redirect = (url) => {
    window.location.href = url;
}


document.getElementById("loginForm").addEventListener("submit", event =>{
    event.preventDefault();
    signin();
})

function signin(){
    
        let players = JSON.parse(localStorage.getItem(`players`)) || [];
        username = document.getElementById("userId").value;
        password = document.getElementById("passwordId").value;

        let player = players.find(player => player.username === username &&
                                      player.password === password);
       player ? redirect("home.html") : alert("Username or Password is Incorrect! Please try again.");
}