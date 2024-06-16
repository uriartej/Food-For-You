import React from 'react';

function SearchBar({ searchTerm, setSearchTerm }) {
    return (
        <div className="SearchBar">
            <input
                type="text"
                placeholder="Search restaurants..."
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />
        </div>
    );
}

export default SearchBar;
