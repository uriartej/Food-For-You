// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import './App.css';
import RestaurantList from './RestaurantList';
import RestaurantForm from './RestaurantForm';

function App() {
    return (
        <Router>
            <div className="App">
                <header className="App-header">
                    <h1>Food Choices For You</h1>
                    <nav>
                        <Link to="/">Home</Link>
                        <Link to="/add-restaurant">Add Restaurant</Link>
                    </nav>
                </header>
                <Routes>
                    <Route path="/" element={<RestaurantList />} />
                    <Route path="/add-restaurant" element={<RestaurantForm />} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;
