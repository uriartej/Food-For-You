import React from 'react';

const FilterMenu = ({ setFilterChoice }) => {
    const handleFilterChange = (e) => {
        setFilterChoice(e.target.value);
    };

    return (
        <div className="filter-menu">
            <label>
                Choose your ideal menu:
                <select onChange={handleFilterChange}>
                    <option value="all">All</option>
                    <option value="healthy">Healthy</option>
                    <option value="weight gain">Weight Gain</option>
                    <option value="protein">Protein</option>
                </select>
            </label>
        </div>
    );
};

export default FilterMenu;
