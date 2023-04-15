import React, { Component } from 'react'
import './App.css';

class App extends Component {
 state = {
    expensesCategories: [],
  }

  componentDidMount() {
     fetch("http://localhost:8080/api/expensecategory")
           .then((result) => result.json())
           .then((result) => {
             this.setState({
               expensesCategories: result,
             })
           })
   }

  render() {
    const { expensesCategories } = this.state;

    const TableHeader = () => {
          return (
              <tr>
                <th>Id</th>
                <th>Category Name</th>
                <th>Description</th>
                <th>Recurring</th>
                <th>Date updated</th>
                <th>Delete</th>
              </tr>
          )
        }

    const remove = async (id) => {
        alert('http://localhost:8080/api/expensecategory/delete/{id}');
        await fetch("http://localhost:8080/api/expensecategory/delete/{id}", {
          method: 'DELETE',
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          }
        }).then(() => {
          alert("done");
        });

      }

    const result = expensesCategories.map((entry, index) => {
      return (
        <tr key={entry.id}>
              <td>{entry.id}</td>
              <td>{entry.category_name}</td>
              <td>{entry.description}</td>
              <td>{entry.recurring}</td>
              <td>{entry.dateCreated}</td>
              <td>
                <button onClick={() => remove(entry.id)}>Delete</button>
              </td>
        </tr>
      )
    })

    return (
      <div className="container">
        <TableHeader />
        {result} 
      </div>
    )
  }
}


export default App
