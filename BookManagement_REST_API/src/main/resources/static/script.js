document.addEventListener("DOMContentLoaded", function() {
    fetch("http://localhost:8080/api/book/all")
        .then(response => response.json())
        .then(books => {
            const bookList = document.getElementById("book-list");
            books.forEach(book => {
                const row = document.createElement("tr");
                row.innerHTML = `
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>
                    <td>
                        <button class="update-btn" onclick="openUpdateModal(${book.id}, '${book.title}', '${book.author}', ${book.price})">Update</button>
                        <button class="delete-btn" onclick="deleteBook(${book.id})">🗑️</button>
                    </td>
                `;
                bookList.appendChild(row);
            });
        })
        .catch(error => console.error("Error fetching books:", error));
});

function openUpdateModal(id, title, author, price) {
    document.getElementById("update-id").value = id;
    document.getElementById("update-title").value = title;
    document.getElementById("update-author").value = author;
    document.getElementById("update-price").value = price;
    document.getElementById("update-modal").style.display = "block";
}

function updateBook(event) {
    event.preventDefault();
    const id = document.getElementById("update-id").value;
    const title = document.getElementById("update-title").value;
    const author = document.getElementById("update-author").value;
    const price = document.getElementById("update-price").value;
    
    fetch("http://localhost:8080/api/book/modify", {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ id, title, author, price })
    }).then(() => {
        document.getElementById("update-modal").style.display = "none";
        location.reload();
    });
}

function deleteBook(id) {
    if (confirm("Are you sure you want to delete this book?")) {
        fetch(`http://localhost:8080/api/book/remove/${id}`, { method: "DELETE" })
            .then(() => location.reload());
    }
}

function closeUpdateModal() {
    document.getElementById("update-modal").style.display = "none";
}


document.getElementById("add-book-btn").addEventListener("click", function() {
    document.getElementById("book-form").style.display = "block";
});

document.querySelector(".close-btn").addEventListener("click", function() {
    document.getElementById("book-form").style.display = "none";
    document.getElementById("update-modal").style.display = "none";
});

document.getElementById("new-book-form").addEventListener("submit", function(event) {
    event.preventDefault();
    const title = document.getElementById("title").value;
    const author = document.getElementById("author").value;
    const price = document.getElementById("price").value;
    
    if (title && author && price) {
        fetch("http://localhost:8080/api/book/create", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ title, author, price })
        }).then(() => location.reload());
    }
});