PROJECT: SCHOOL MANAGEMENT SYSTEM 
This is a desktop application built using Java (Swing GUI) in NetBeans IDE. It demonstrates my skills in Java programming, Object-oriented programming, database connectivity (JDBC), and software design patterns.

Technologies Used:
Java : Core Programming Language
Netbeans : IDE
Swimg : Desktop GUI Components 
MYSQL : Database
JDBC : For Database Connectivity


FEATURES:
* Registers the student
* Student portal which displays results, extra services, notices and allows to send requests for different purpose to admin.
* Teacher portal where teacher uploqad marks, and view notices.
* Admin portal where admin can add notices and handles requests of students by approving or rejecting them.
* All of the data is stored in database for effecient handling.

DESIGN PATTERNS USED:
* Singleton Pattern
* Factory Pattern
* Observer Pattern
* Chain Of Responsibility Pattern

DATABASE SCHEMA:

 Database: `school`
--

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email`, `password`) VALUES
('admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `applications`
--

CREATE TABLE `applications` (
  `id` int(11) NOT NULL,
  `applicant_name` varchar(100) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `details` text DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `applications`
--

INSERT INTO `applications` (`id`, `applicant_name`, `role`, `type`, `details`, `status`) VALUES
(1, 'Isbah Ali', 'student', 'Certificate', 'Kindly grant me my certificate', 'Approved'),
(2, 'Isbah Ali', 'student', 'Certificate', 'heello', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `FatherName` varchar(50) NOT NULL,
  `Class` varchar(50) NOT NULL,
  `Adress` varchar(50) NOT NULL,
  `Contact` varchar(11) NOT NULL,
  `RolNo` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Name`, `FatherName`, `Class`, `Adress`, `Contact`, `RolNo`, `Email`, `Password`) VALUES
(1, 'Isbah Ali', 'Syed Arshad Ali', '9', 'karachi', '03000', '266', 'isbah@gmail.com', 'isbah'),
(2, 'Maham Ahmed', 'Ahmed Ali', '3', 'Karachi', '050000', '255', 'maham@gmail.com', 'maham');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `Student` varchar(50) NOT NULL,
  `RollNo` varchar(50) NOT NULL,
  `EnglishMids` int(11) DEFAULT NULL,
  `EnglishFinal` int(11) DEFAULT NULL,
  `ScienceMids` int(11) DEFAULT NULL,
  `ScienceFinal` int(11) DEFAULT NULL,
  `MathsMids` int(11) DEFAULT NULL,
  `MathsFinal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`Student`, `RollNo`, `EnglishMids`, `EnglishFinal`, `ScienceMids`, `ScienceFinal`, `MathsMids`, `MathsFinal`) VALUES
('Isbah Ali', '266', 35, 40, 42, 38, 43, 44),
('Eishal Fahim', '381', 45, NULL, 46, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `subj1` varchar(50) NOT NULL,
  `subj2` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`name`, `email`, `password`, `subj1`, `subj2`) VALUES
('Shazia', 'shazia@gmail.com', 'shazee', 'English', 'General');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applications`
--
ALTER TABLE `applications`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `applications`
--
ALTER TABLE `applications`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;
