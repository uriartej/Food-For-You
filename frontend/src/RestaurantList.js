// src/RestaurantList.js
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './RestaurantList.css';

function RestaurantList() {
    const [restaurants, setRestaurants] = useState([]);
    const [searchTerm, setSearchTerm] = useState('');

    useEffect(() => {
        axios.get('http://localhost:8080/restaurants')
            .then(response => {
                setRestaurants(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the restaurants!', error);
            });
    }, []);

    const filteredRestaurants = restaurants.filter(restaurant =>
        restaurant.name.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <div className="RestaurantList">
            <h2>Restaurants</h2>
            <input
                type="text"
                placeholder="Search restaurants..."
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
                className="SearchBar"
            />
            {filteredRestaurants.map((restaurant, index) => (
                <div key={index} className="Restaurant">
                    <h3>{restaurant.name}</h3>
                    {restaurant.menuItems.map((item, idx) => (
                        <div key={idx} className="MenuItem">
                            <strong>{item.name}</strong>: {item.price} - {item.description} ({item.nutritionalInformation})
                        </div>
                    ))}
                </div>
            ))}
        </div>
    );
}

export default RestaurantList;
