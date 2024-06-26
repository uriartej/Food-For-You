import React, { useState } from 'react';
import axios from 'axios';

const RestaurantForm = () => {
    const [name, setName] = useState('');
    const [menuItem, setMenuItem] = useState({ name: '', price: '', description: '', nutritionalInformation: '' });
    const [restaurantToUpdate, setRestaurantToUpdate] = useState('');
    const [restaurantToDelete, setRestaurantToDelete] = useState('');

    const handleAddRestaurant = () => {
        axios.post('http://localhost:8080/restaurants', { name })
            .then(() => {
                setName('');
            })
            .catch(error => console.error('Error adding restaurant:', error));
    };

    const handleUpdateRestaurant = () => {
        axios.put(`http://localhost:8080/restaurants/${restaurantToUpdate}`, { name })
            .then(() => {
                setRestaurantToUpdate('');
                setName('');
            })
            .catch(error => console.error('Error updating restaurant:', error));
    };

    const handleDeleteRestaurant = () => {
        axios.delete(`http://localhost:8080/restaurants/${restaurantToDelete}`)
            .then(() => {
                setRestaurantToDelete('');
            })
            .catch(error => console.error('Error deleting restaurant:', error));
    };

    const handleAddMenuItem = () => {
        axios.post(`http://localhost:8080/restaurants/${name}/menu`, menuItem)
            .then(() => {
                setMenuItem({ name: '', price: '', description: '', nutritionalInformation: '' });
            })
            .catch(error => console.error('Error adding menu item:', error));
    };

    return (
        <div>
            <h2>Add Restaurant</h2>
            <div>
                <label>Name:
                    <input type="text" value={name} onChange={e => setName(e.target.value)} />
                </label>
            </div>
            <div>
                <h3>Menu Items</h3>
                <label>Item Name:
                    <input type="text" value={menuItem.name} onChange={e => setMenuItem({ ...menuItem, name: e.target.value })} />
                </label>
                <label>Price:
                    <input type="text" value={menuItem.price} onChange={e => setMenuItem({ ...menuItem, price: e.target.value })} />
                </label>
                <label>Description:
                    <input type="text" value={menuItem.description} onChange={e => setMenuItem({ ...menuItem, description: e.target.value })} />
                </label>
                <label>Nutritional Information:
                    <input type="text" value={menuItem.nutritionalInformation} onChange={e => setMenuItem({ ...menuItem, nutritionalInformation: e.target.value })} />
                </label>
            </div>
            <button onClick={handleAddMenuItem}>Add Menu Item</button>
            <button onClick={handleAddRestaurant}>Add Restaurant</button>
            <div>
                <h2>Update Restaurant</h2>
                <label>Restaurant to Update:
                    <input type="text" value={restaurantToUpdate} onChange={e => setRestaurantToUpdate(e.target.value)} />
                </label>
                <button onClick={handleUpdateRestaurant}>Update Restaurant</button>
            </div>
            <div>
                <h2>Delete Restaurant</h2>
                <label>Restaurant to Delete:
                    <input type="text" value={restaurantToDelete} onChange={e => setRestaurantToDelete(e.target.value)} />
                </label>
                <button onClick={handleDeleteRestaurant}>Delete Restaurant</button>
            </div>
        </div>
    );
};

export default RestaurantForm;
