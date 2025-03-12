class user_Accounts {
    constructor(username, password) {
        this.username = username;
        this.password = password;
    }

}

function CreateAccount() {

    const username = document.getElementById('userId').value;
    const password = document.getElementById('passwordId').value;

    try {
        if (username === "" || password === "") {
            console.warn("Your Username or Password cannot be empty!");
        }

        let players = JSON.parse(localStorage.getItem('players')) || [];
        let newAccount = new user_Accounts(username, password);
        players.push(newAccount);
        localStorage.setItem('players', JSON.stringify(players));
        console.log(players);
    }

    catch (error) {
        console.error(error);
    }




}
