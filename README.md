# 📚 Book Management System (Frontend)

This is a **Book Management System** frontend built with **HTML, CSS, and JavaScript** that interacts with a **REST API** to manage books. It allows users to **add, update, and delete books** dynamically.

---

## 🚀 Features
- 📚 Fetch and display books from a REST API.
- ➕ Add new books with a form.
- ✏️ Update book details using a modal.
- 🗑️ Delete books with a confirmation prompt.
- 🎨 Responsive UI with a clean design.

---

## 🛠️ Setup Instructions

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/lakshay1341/BookManagement_REST_API.git
cd BookManagement_REST_API
```

### **2️⃣ Start the Backend**
Ensure that the backend REST API is running. If using **Spring Boot**, start it with:
```sh
mvn spring-boot:run
```

### **3️⃣ Open the Frontend**
Simply open the `index.html` file in your browser.

---

## 📌 Usage

### ➕ **Add a New Book**
1. Click the `+ Add New Book` button.
2. Enter the **Title, Author, and Price**.
3. Click **"Add Book"**, and the book will be saved.

### ✏️ **Update a Book**
1. Click the **"Update"** button next to a book.
2. Modify the details in the update modal.
3. Click **"Update Book"**, and the changes will be saved.

### 🗑️ **Delete a Book**
1. Click the **🗑️ Delete** button.
2. Confirm the deletion, and the book will be removed.

---

## 🌐 API Endpoints (Used in Frontend)
| Method | Endpoint | Description |
|--------|---------|------------|
| **GET** | `/api/book/all` | Fetch all books |
| **POST** | `/api/book/create` | Add a new book |
| **PUT** | `/api/book/modify` | Update a book |
| **DELETE** | `/api/book/remove/{id}` | Delete a book |

---

## 🖼️ Screenshots
### **📌 Home Page**
![Home Page](https://github.com/lakshay1341/BookManagement_REST_API/blob/main/BookManagement_Images/list.png)

### **📌 Add Book Modal**
![Add Book](https://github.com/lakshay1341/BookManagement_REST_API/blob/main/BookManagement_Images/create.png)

### **📌 Update Book Modal**
![Update Book](https://github.com/lakshay1341/BookManagement_REST_API/blob/main/BookManagement_Images/update.png)

---

## 🛠️ Technologies Used
- **Frontend:** HTML, CSS, JavaScript (Vanilla JS)
- **Backend:** REST API (Spring Boot)
- **Database:** MySQL / H2 (Based on API)

---

## 🐝 Contributing
Contributions are welcome! Feel free to fork the repo and submit a pull request.

---

## 🐝 Issues
If you encounter any issues, please [open an issue](https://github.com/lakshay1341/BookManagement_REST_API/issues).

---

## 🐜 License
This project is open-source and available under the **MIT License**.

👨‍💻 **Developed by [Lakshay](https://github.com/lakshay1341)**  
🌟 **If you like this project, give it a star on GitHub!** 🌟

