import React from 'react';

function Restaurants({ restaurants }) {
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
                                    <p>Price: {item.price}</p>
                                    <p>Description: {item.description}</p>
                                    <p>Nutritional Information: {item.nutritionalInformation}</p>
                                </li>
                            ))}
                        </ul>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Restaurants;
