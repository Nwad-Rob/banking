import logo from './logo.svg';
import './App.css';

//Get Transaction Types
const transactType = document.querySelector("#transact-type");

//Get Transaction Forms
const paymentCard = document.querySelector(".payment-card");
const transfercard = document.querySelector(".transfer-card");

transactType.addEventListener("change", ()=>{
    //Check for Transaction type and Display Forms
    switch(transactType.value()){
      case "payment" :
        paymentCard.style.display = "block";
        paymentCard.nextElementSibling.style.display = "none";
        break;
    }
});

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
