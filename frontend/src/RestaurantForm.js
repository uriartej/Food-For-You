import React, { useState } from 'react';
import axios from 'axios';
import './RestaurantForm.css';

function RestaurantForm() {
    const [name, setName] = useState('');
    const [menuItems, setMenuItems] = useState([]);
    const [menuItem, setMenuItem] = useState({ name: '', price: '', description: '', nutritionalInformation: '' });

    const addMenuItem = () => {
        setMenuItems([...menuItems, menuItem]);
        setMenuItem({ name: '', price: '', description: '', nutritionalInformation: '' });
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        const restaurant = { name, menuItems };
        axios.post('http://localhost:8080/restaurants', restaurant)
            .then(response => {
                console.log('Restaurant added:', response.data);

            })
            .catch(error => {
                console.error('There was an error adding the restaurant:', error);
            });
    };

    return (
        <div className="form-container">
            <h2>Add Restaurant</h2>
            <form onSubmit={handleSubmit}>
                <div className="form-group">
                    <label>Name:</label>
                    <input type="text" value={name} onChange={(e) => setName(e.target.value)} required />
                </div>
                <h3>Menu Items</h3>
                {menuItems.map((item, index) => (
                    <div key={index} className="form-group">
                        <strong>{item.name}</strong>: {item.price} - {item.description} ({item.nutritionalInformation})
                    </div>
                ))}
                <div className="form-group">
                    <label>Item Name:</label>
                    <input type="text" value={menuItem.name} onChange={(e) => setMenuItem({ ...menuItem, name: e.target.value })} required />
                </div>
                <div className="form-group">
                    <label>Price:</label>
                    <input type="text" value={menuItem.price} onChange={(e) => setMenuItem({ ...menuItem, price: e.target.value })} required />
                </div>
                <div className="form-group">
                    <label>Description:</label>
                    <input type="text" value={menuItem.description} onChange={(e) => setMenuItem({ ...menuItem, description: e.target.value })} required />
                </div>
                <div className="form-group">
                    <label>Nutritional Information:</label>
                    <input type="text" value={menuItem.nutritionalInformation} onChange={(e) => setMenuItem({ ...menuItem, nutritionalInformation: e.target.value })} required />
                </div>
                <div className="button-group">
                    <button type="button" onClick={addMenuItem}>Add Menu Item</button>
                    <button type="submit">Add Restaurant</button>
                </div>
            </form>
        </div>
    );
}

export default RestaurantForm;
