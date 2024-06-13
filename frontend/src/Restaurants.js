import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Restaurants = () => {
    const [restaurants, setRestaurants] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/restaurants')
            .then(response => {
                setRestaurants(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching data.', error);
            });
            
    }, []);

    return (
        <div>
            <h1>Restaurants</h1>
            {restaurants.length > 0 ? (
            <u1>
                {restaurants.map((restaurant, index) => (
                    <li key = {index}>{restaurant.name}</li>
                ))}
            </u1>
            ) : (
                <p>Loading restaurants ...</p>
            )}
        </div>
    );
};

export default Restaurants;