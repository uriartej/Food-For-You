import React from 'react';
import './RestaurantList.css';

const RestaurantList = ({ searchTerm, filterChoice, restaurants }) => {
    const filterItems = (items) => {
        return items.filter(item => {
            const description = item.description.toLowerCase();
            if (!filterChoice || filterChoice === 'all') return true; 
            if (filterChoice === 'healthy') return description.includes('healthy') || description.includes('low fat');
            if (filterChoice === 'weight gain') return description.includes('weight gain') || description.includes('high calories');
            if (filterChoice === 'protein') return description.includes('protein');
            return false;
        });
    };

    const filteredRestaurants = restaurants.filter(restaurant =>
        restaurant.name.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <div className="restaurant-list">
            <h2>Restaurants</h2>
            {filteredRestaurants.map(restaurant => (
                <div key={restaurant.name} className="restaurant">
                    <h3>{restaurant.name}</h3>
                    {filterItems(restaurant.menuItems).map(item => (
                        <div key={item.name} className="menu-item">
                            <p>{item.name}</p>
                            <p>{item.price}</p>
                            <p>{item.description}</p>
                            <p>{item.nutritionalInformation}</p>
                        </div>
                    ))}
                </div>
            ))}
        </div>
    );
};

export default RestaurantList;
