import React from 'react';
import './App.css';
import RestaurantList from './RestaurantList';

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <h1>Food Choices For You</h1>
            </header>
            <RestaurantList />
        </div>
    );
}

export default App;
