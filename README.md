# ShopWise Ecommerce Platform

ShopWise is a full-stack ecommerce solution featuring a modern React frontend and robust Spring Boot backend. Designed for both customers and administrators, it provides seamless shopping experiences and efficient product management.

## Key Features

### Core Functionality
- 🛒 **Cart Management**: Add/remove items, adjust quantities
- 💳 **Cash Order Processing**: Complete purchases with cash payments
- 📋 **Bill Generation**: Printable order receipts with itemized details
- 🔍 **Advanced Filtering**: Search by product name, filter by category
- 📱 **Responsive Design**: Works on mobile, tablet, and desktop

### Product Management
- ✅ **Category & Product CRUD**: Full create-read-update-delete operations
- 🖼️ **Image Handling**: Upload product images stored in filesystem
- 🔎 **Live Search**: Instant product search results
- 🗑️ **Delete Products**: Remove items with confirmation

### User System
- 👥 **Role-Based Access**:
  - **Admin**: Full product/category management
  - **Customer**: Shopping cart and order placement
- 🔒 **Secure Authentication**: JWT-based login system

### Technical Highlights
- ⚡ **Real-time Updates**: UI instantly reflects changes
- 🔄 **RESTful APIs**: Clean backend architecture
- 📦 **Image Optimization**: Efficient file handling
- 📊 **Dynamic UI**: Reactive components with Bootstrap 5
  - **🏗️ Robust Architecture**:  
  - Layered MVC design with 🧑‍💻 Controllers, 💼 Services, 📂 Repositories, and ✨ DTOs.  


## Technology Stack

### Frontend
- **Framework**: React 18
- **Styling**: Bootstrap 5 + CSS Modules
- **State Management**: React Context API
- **HTTP Client**: Axios
- **Routing**: React Router 6

### Backend
- **Framework**: Spring Boot 3
- **Security**: Spring Security + JWT
- **Persistence**: Spring Data JPA
- **Database**: MySQL 8
- **Build Tool**: Maven

### Infrastructure
- **Database**: MySQL
- **File Storage**: Local filesystem (images)
- **API Documentation**: OpenAPI 3 (Swagger)

## Getting Started

### Prerequisites
- Java 17+
- Node.js 18+
- MySQL 8.0+
- Maven 3.8+


![User Mode](https://github.com/shubhamt45/ShopWise/blob/main/Screenshot%202025-06-08%20192009.png?raw=true)  

![Admin Mode](https://github.com/shubhamt45/ShopWise/blob/main/Screenshot%202025-06-08%20192214.png?raw=true)

![Bill Genration](https://github.com/shubhamt45/ShopWise/blob/main/Screenshot%202025-06-08%20193154.png?raw=true)

### Installation

#### 1. Backend Setup
```bash
# Clone repository
git clone https://github.com/your-username/shopwise-ecommerce.git

# Navigate to backend
cd shopwise-backend

# Configure database (create shopwise_db in MySQL)
mysql -u root -p < src/main/resources/schema.sql

# Build application
mvn clean package

# Run Spring Boot
mvn spring-boot:run
```

#### 2. Frontend Setup
```bash
# Navigate to frontend
cd ../shopwise-frontend

# Install dependencies
npm install

# Start development server
npm start
```

### Configuration
Create `.env` file in frontend:
```env
REACT_APP_API_BASE_URL=http://localhost:8080/api
REACT_APP_IMAGE_BASE_URL=http://localhost:8080/images
```

Configure backend in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shopwise_db
spring.datasource.username=dbuser
spring.datasource.password=dbpass

app.upload-dir=./uploads
```

## Usage

### Customer Flow
1. **Browse products** with category filters
2. **Search** for specific items
3. **Add items** to shopping cart
4. **Checkout** with cash payment
5. **Receive** generated invoice

### Admin Flow
1. **Login** with admin credentials
2. **Manage categories** (create/update/delete)
3. **Upload product images** during creation
4. **Modify product details** and inventory
5. **View** all orders

## API Documentation
Access Swagger UI at `http://localhost:8080/swagger-ui.html` after starting backend:

![Swagger API Documentation](https://via.placeholder.com/600x300?text=API+Documentation)

## Project Structure

```
shopwise-ecommerce/
├── shopwise-backend/        # Spring Boot application
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/shopwise/
│   │   │   │   ├── config/      # Security & config classes
│   │   │   │   ├── controllers/ # REST controllers
│   │   │   │   ├── entities/    # JPA entities
│   │   │   │   ├── repositories/# Data repositories
│   │   │   │   ├── security/    # Auth implementation
│   │   │   │   └── services/    # Business logic
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       └── schema.sql
│   │   └── test/             # Unit tests
│   └── pom.xml
│
└── shopwise-frontend/       # React application
    ├── public/
    ├── src/
    │   ├── components/      # Reusable UI components
    │   ├── contexts/        # State management
    │   ├── pages/           # Application views
    │   │   ├── admin/       # Admin screens
    │   │   ├── cart/        # Cart management
    │   │   ├── products/    # Product listings
    │   │   └── user/        # Authentication
    │   ├── services/        # API clients
    │   ├── utils/           # Helper functions
    │   ├── App.js
    │   └── index.js
    ├── package.json
    └── README.md
```

## Contributing

We welcome contributions! Please follow these steps:
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a pull request

## License
Distributed under the MIT License. See `LICENSE` for more information.

---
**ShopWise** - Your smart shopping solution • [Live Demo](#) • [Report Bug](#)
