const convertButton = document.querySelector("#convertButton");

convertButton.addEventListener("click", handleConversion);// does something

function handleConversion() {
    const valueInput = document.querySelector("#valueInput");
    const fromUnitSelect = document.querySelector("#fromUnitSelect");
    const toUnitSelect = document.querySelector("#toUnitSelect");

    const value = parseFloat(valueInput.value);
    const fromUnit = fromUnitSelect.value;
    const toUnit = toUnitSelect.value;

    // how tf do i make an api call here
    return 0;
}