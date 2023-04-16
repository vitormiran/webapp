import React, { useState } from 'react';

const AddExpenseCategoryForm = props => {
    const initialFormState = { id: null, name: '', description: '' }
    const [ expensecategory, setExpenseCategory ] = useState(initialFormState)

    return (
        <form
        onSubmit={event => {
            alert("ok");
            
        }}
        >
            <div class="container text-center">
            <div class="row">
                <div class="col">
                    Category Name
                </div>
                <div class="col">
                    Category Description
                </div>
                <div class="col"/>
            </div>
                <div class="row">
                    <div class="col">
                        <input type="text" class="form-control" name="category_name" aria-describedby="categoryHelp" />
                        <div id="emailHelp" class="form-text">A category for the expense</div>
                    </div>
                    <div class="col">
                        <input type="text" class="form-control" name="category_description" />
                    </div>
                    <div class="col">
                        <button type="submit" class="btn btn-primary" >Submit</button>
                    </div>
                </div>
            </div>
        </form>
    )
}

export default AddExpenseCategoryForm