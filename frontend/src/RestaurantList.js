import React, { useEffect, useState } from 'react';
import axios from 'axios';

function RestaurantList() {
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
        <div>
            <h2>Restaurants</h2>
            <ul>
                {restaurants.map((restaurant, index) => (
                    <li key={index}>
                        <h3>{restaurant.name}</h3>
                        <ul>
                            {restaurant.menuItems.map((item, idx) => (
                                <li key={idx}>
                                    <p>{item.name}</p>
                                    <p>{item.price}</p>
                                    <p>{item.description}</p>
                                    <p>{item.nutritionalInformation}</p>
                                </li>
                            ))}
                        </ul>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default RestaurantList;
