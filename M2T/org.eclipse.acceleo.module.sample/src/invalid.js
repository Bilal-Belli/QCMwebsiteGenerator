// JavaScript for QCM: 

let currentPageIndex = 0;
const pages = document.querySelectorAll('.page');

function navigate(direction) {
    // Masquer la page actuelle
    pages[currentPageIndex].classList.add('d-none');

    // Mettre à jour l'index de la page
    currentPageIndex += direction;

    // Assurer que l'index reste dans les limites
    if (currentPageIndex < 0) currentPageIndex = 0;
    if (currentPageIndex >= pages.length) currentPageIndex = pages.length - 1;

    // Afficher la nouvelle page
    pages[currentPageIndex].classList.remove('d-none');

    // Gérer la visibilité des boutons
    document.getElementById('prev-button').style.display = currentPageIndex === 0 ? 'none' : 'inline-block';
    document.getElementById('next-button').style.display = currentPageIndex === pages.length - 1 ? 'none' : 'inline-block';
}

// Initialisation pour afficher la première page
document.addEventListener('DOMContentLoaded', () => {
    if (pages.length > 0) {
        pages[0].classList.remove('d-none');
    }
});
