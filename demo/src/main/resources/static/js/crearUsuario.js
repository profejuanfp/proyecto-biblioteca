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

document.addEventListener("DOMContentLoaded", () => {
    const iconoMenu = document.querySelector(".icono-menu");
    const iconoCerrar = document.querySelector(".icono-cerrar");
    const menu = document.querySelector (".menu");
    const lista = document.querySelector(".lista");
    const agregarLibro = document.querySelector(".contenedor-agregar-libro")

    // Botón menu
    iconoMenu.addEventListener("click", () => {
        console.log("Botón de Iniciar Sesión clicado");
        menu.classList.add('active');
        iconoMenu.classList.add('active');
        lista.style.display = 'block'; // Mostrar menu
        iconoMenu.style.display = 'none'; // Ocultar icono de menu
    });
    
    // Botón cerrar
    iconoCerrar.addEventListener("click", () => {
        console.log("Botón de Cerrar Sesión clicado");
        menu.classList.remove('active');
        iconoMenu.classList.remove('active');
        lista.style.display = 'none'; // Ocultar menu
        iconoMenu.style.display = 'block'; // Mostrar icono de menu
    });
});