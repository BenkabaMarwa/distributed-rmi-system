# Java RMI Distributed System

A Java RMI (Remote Method Invocation) project demonstrating how a client and server communicate using remote objects.

---

## 🧩 Project Structure

├── clientRmi/
├── serverRmi/
└── README.md

- `clientRmi` → Contains client-side implementation.
- `serverRmi` → Contains server-side implementation.
- `RMIinterface.java` → Defines the remote contract shared between both sides.

---

## 🚀 How to Run

1. **Compile all files**
   ```bash
   javac src/**/*.java
  ``
  
2. Start the RMI Registry
  ```bash
  rmiregistry
  ```

3. Run the server
  ```bash
  java serverRmi.Server
  ```

4. Run the client
  ```bash
  java clientRmi.Client
  ```

---

## 🪪 License

This project is licensed under the MIT License – you’re free to use, modify, and share it.

---

## 👩‍💻 Author

Benkaba Marwa
