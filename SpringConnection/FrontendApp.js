//In react you add this


import './App.css';
import React, { useEffect, useState } from "react";

function App() {
  const [users, setUsers] = useState([]);
  useEffect(() => {
    fetch("http://localhost:9090/api/users") // Call Backend URL
      .then(response => response.json()) //convert response to json
      .then(data => setUsers(data)) //store data in users state
      .catch(error => console.error("Error Fetching users: ", error));
  }, []);
  return (
    <div className="App">
      <h1>User List</h1>
      {users.map((user, index) => (
        <li key={index}>{user}</li>
      ))}
    </div>
  );
}

export default App;
