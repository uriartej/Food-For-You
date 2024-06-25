import React, { useState, useEffect } from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import axios from 'axios';
import RestaurantList from './RestaurantList';
import RestaurantForm from './RestaurantForm';
import SearchBar from './SearchBar';
import FilterMenu from './FilterMenu';
import './App.css';

function App() {
    const [searchTerm, setSearchTerm] = useState('');
    const [filterChoice, setFilterChoice] = useState('all');
    const [restaurants, setRestaurants] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/restaurants')
            .then(response => {
                setRestaurants(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the restaurants!', error);
            });
    }, []);

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
                    <Route path="/" element={
                        <>
                            <SearchBar searchTerm={searchTerm} setSearchTerm={setSearchTerm} />
                            <FilterMenu setFilterChoice={setFilterChoice} />
                            <RestaurantList searchTerm={searchTerm} filterChoice={filterChoice} restaurants={restaurants} />
                        </>
                    } />
                    <Route path="/add-restaurant" element={<RestaurantForm />} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;
