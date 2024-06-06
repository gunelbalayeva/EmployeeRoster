document.addEventListener("DOMContentLoaded", function() {
    const refreshButton = document.getElementById('refreshButton');
    const rosterList = document.getElementById('roster');

    refreshButton.addEventListener('click', function() {
        rosterList.innerHTML = ''; // Temizleme
        const allPeople = ['Rizvan', 'Deyanet', 'Metin', 'Nizami', 'Raqif', 'Ilaheddin', 'Kerem'];
        const fixedPeople = ['Ilaheddin', 'Kerem'];
        const selectedPeople = selectPeople(allPeople, fixedPeople);

        document.getElementById('date').innerText = 'Date and Time: ' + new Date().toLocaleString();

        selectedPeople.forEach(person => {
            const listItem = document.createElement('li');
            listItem.innerText = person;
            rosterList.appendChild(listItem);
        });
    });

    function selectPeople(allPeople, fixedPeople) {
        allPeople = allPeople.filter(person => !fixedPeople.includes(person));
        const selectedPeople = [];
        while (allPeople.length > 0) {
            const index = Math.floor(Math.random() * allPeople.length);
            selectedPeople.push(allPeople.splice(index, 1)[0]);
        }
        selectedPeople.splice(3, 0, "Ilaheddin");
        selectedPeople.splice(5, 0, "Kerem");
        return selectedPeople;
    }


    refreshButton.click();
});
