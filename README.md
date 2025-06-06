# Disaster Management System

A Java-based desktop application that provides disaster preparedness information and prevention measures for different types of natural disasters.

## Overview

This application serves as an educational tool for disaster management, offering two user interfaces:
- **Public User Interface**: View disaster prevention measures
- **Government User Interface**: View and add custom disaster prevention measures

## Features

### Public User Access
- Access disaster prevention information without authentication
- View preventive measures for:
  - Floods
  - Landslides
  - Earthquakes
  - Wildfires

### Government User Access
- Secure login with username/password validation
- View all disaster prevention measures
- Add custom prevention measures to existing disaster categories
- Enhanced interface with editable content areas

## System Requirements

- Java Development Kit (JDK) 8 or higher
- Java AWT and Swing libraries (included in standard JDK)

## Installation and Setup

1. **Clone or download the project files**
2. **Compile the Java files:**
   ```bash
   javac -d . *.java
   ```
3. **Run the application:**
   ```bash
   java group1.LoginApp
   ```

## Usage

### Starting the Application
1. Run the `LoginApp` class
2. Choose between:
   - **Government User**: Requires authentication
   - **Public User**: Direct access to information

### Government User Login
- **Username format**: `alphabets@gov` (e.g., `admin@gov`)
- **Password format**: `alphabets@numbers` (e.g., `password@123`)

### Navigation
- Click on disaster type buttons to view prevention measures
- Government users can add custom measures using the text area and "Add" button

## Application Structure

```
group1/
├── LoginApp.java          # Main application entry point
├── Login3.java            # Government user authentication
├── TestClimate.java       # Public user disaster information
└── TestClimate1.java      # Government user enhanced interface
```

## Class Descriptions

### LoginApp
- Main entry point of the application
- Provides user type selection (Government/Public)
- Routes users to appropriate interfaces

### Login3
- Handles government user authentication
- Validates username and password formats
- Displays error messages for invalid inputs

### TestClimate
- Public user interface for viewing disaster information
- Read-only access to prevention measures
- Covers four disaster types

### TestClimate1
- Enhanced government user interface
- Includes all public features plus:
  - Ability to add custom prevention measures
  - Editable text areas for content management

## Disaster Categories Covered

1. **Floods**
   - Weather monitoring
   - Emergency planning
   - Document protection
   - Safety guidelines

2. **Landslides**
   - Location awareness
   - Erosion prevention
   - Expert consultation
   - Warning signs recognition

3. **Earthquakes**
   - Home safety measures
   - Emergency preparedness
   - Safe spot identification
   - Response techniques

4. **Wildfires**
   - Property protection
   - Defensible space creation
   - Emergency equipment
   - Evacuation procedures

## Technical Details

- **Framework**: Java AWT (Abstract Window Toolkit)
- **GUI Components**: Frame, Label, Button, TextField, TextArea
- **Event Handling**: ActionListener interface
- **Layout**: Absolute positioning with setBounds()

## Security Features

- Input validation for government user credentials
- Format checking for username and password
- Error handling for invalid inputs

## Future Enhancements

- Database integration for persistent data storage
- User management system
- Additional disaster categories
- Improved UI with modern frameworks
- Multi-language support
- Mobile application version

## Contributing

To contribute to this project:
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## License

This project is developed for educational purposes in disaster management and preparedness.

## Support

For questions or issues, please contact the development team or create an issue in the project repository.
```

