// src/App.js
import React from 'react';
import './App.css';
import Restaurants from './Restaurants';

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <h1>Food Choices For You</h1>
            </header>
            <Restaurants />
        </div>
    );
}

export default App;
