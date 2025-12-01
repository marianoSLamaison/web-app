const GC_userNameField = "NameInput"
const GC_password = "PasswordInput"

class LogginData 
{
    constructor(name, password)
    {
        this.name = name;
        this.password = password;
    }
    getName() {return this.name;}
    getPasswrod() {return this.password;}
}

function sendDataToCheck()
{
    let textFieldUserName = document.getElementById(GC_userNameField);
    let textFieldPassword = document.getElementById(GC_password);
    let logginData = new LogginData(textFieldUserName.value, textFieldPassword.value);
    let jsonLogginData = JSON.stringify(logginData);
    console.log(jsonLogginData);
    let promise = fetch("/isLogInfoValid",
        {
            method : "POST",
            headers : {
                'Content-Type' : 'application/json'
            },
            body : jsonLogginData
        }
    )
    promise.then((responce) => responce.json().then((data) => {
        if (data.response == true)
        {
            console.log("Usuario correcto");
        }
        else {
            console.log("Usuario desconocido");
        }
    }));
}