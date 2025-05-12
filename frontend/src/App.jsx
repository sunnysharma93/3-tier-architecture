import React from 'react';
import RegistrationForm from './Components/RegistrationForm';
import './styles/RegistrationForm.css';

const App = () => {
  return (
    <div className="App">
      <header className="App-header">
        <h1>User Registration</h1>
      </header>
      <main>
        <RegistrationForm />
      </main>
    </div>
  );
}

export default App;
