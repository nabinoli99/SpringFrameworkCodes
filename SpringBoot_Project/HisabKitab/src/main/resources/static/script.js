let total = 0;

function addExpense() {
    const descInput = document.getElementById('desc');
    const amountInput = document.getElementById('amount');
    const list = document.getElementById('expense-list');
    const totalDisplay = document.getElementById('total-amount');

    if (descInput.value === '' || amountInput.value === '') {
        alert("Please fill both fields, bro!");
        return;
    }

    // Create List Item
    const li = document.createElement('li');
    li.innerHTML = `
        <span>${descInput.value}</span>
        <strong>Rs. ${amountInput.value}</strong>
    `;

    list.appendChild(li);

    // Update Total
    total += parseFloat(amountInput.value);
    totalDisplay.innerText = `Rs. ${total}`;

    // Clear Inputs
    descInput.value = '';
    amountInput.value = '';
}