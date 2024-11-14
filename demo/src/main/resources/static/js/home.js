let listElement = document.querySelectorAll('.list_button');

listElement.forEach(listElement => {
    listElement.addEventListener('click', () => {
        
        // Añadir o quitar la clase 'arrow' para el icono
        listElement.classList.toggle('arrow');
        
        // Obtener el submenú relacionado con el botón
        let menu = listElement.nextElementSibling;

        // Comprobamos si el submenú está oculto y alternamos su visibilidad
        if (menu.style.maxHeight) {
            // Si el submenú ya tiene una altura máxima, lo ocultamos
            menu.style.maxHeight = null;
        } else {
            // Si el submenú está oculto, lo expandimos
            menu.style.maxHeight = menu.scrollHeight + "px";
        }
    });
});