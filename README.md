# High cohesion.

<h1>video link: </h1> 

High cohesion refers to how closely related and focused the responsibilities of a module, class, or component are. It means that everything within the module works together to achieve a single, clear purpose without mixing unrelated tasks.

What is High Cohesion?  
High cohesion occurs when a module or class is responsible for one specific task or a group of closely related tasks. It ensures that the code is organized, focused, and easy to manage.  

When a system has high cohesion, each part works on a clearly defined job, making the entire system more structured and predictable. This design principle is important because it reduces confusion and enhances the system's efficiency.

-------Characteristics of High Cohesion:-------

1. Single Purpose:  
Each module or class is dedicated to one primary function or a small set of related tasks. This means the module does not mix multiple responsibilities, making it easier to understand and maintain.  

For instance, if a module manages user information, it should only handle user-related tasks like saving user details, updating information, and retrieving user data—without performing unrelated functions like logging errors or processing payments.  

2. Clear Boundaries: 
High cohesion ensures that a module has well-defined boundaries and a specific area of responsibility. Each component performs tasks related to its purpose and does not interfere with other parts of the system.  

This clarity helps developers know where to look when changes are needed and what each module is responsible for, reducing the risk of errors when modifying code.  

3. Internal Consistency: 
All the functions within a highly cohesive module are logically connected and work toward the same objective. This internal consistency makes the code predictable and easier to navigate.  

For example, in a shopping cart module, all the functions—adding items, removing items, and calculating totals—are connected by a common purpose: managing the cart.  

4. Focused Behavior:  
A highly cohesive module performs a narrow, well-defined job without taking on unrelated duties. This focus makes the module more robust and easier to update.  

When a module focuses on one area, it reduces complexity and minimizes the chance of breaking other parts of the system when making changes.

-------Benefits of High Cohesion:-------

1. Simplified Maintenance:
When a module has high cohesion, changes are easier to make because all related code is located in one place. If you need to modify a feature, you can do so without affecting other parts of the system. This leads to quicker updates and fewer bugs.  

2. Better Readability:  
Code that is highly cohesive is easier to read and understand because each module has a clear, single focus. This is especially useful when working with large codebases where quick comprehension is essential for productivity.  

3. Increased Reusability:  
When a module is focused on a single task, it becomes easier to reuse in other applications or projects. For example, a payment-processing module can be reused in multiple e-commerce platforms if it only handles payment-related tasks.  

4. Improved Testing:  
Testing becomes more effective with high cohesion because each module has a specific purpose. This allows developers to create targeted test cases that cover the module’s behavior thoroughly without needing to worry about other unrelated parts.  

5. Efficient Collaboration:  
In teams, high cohesion allows multiple developers to work on different modules without overlapping responsibilities. Since each module is self-contained, changes made by one developer will not disrupt others, increasing overall efficiency and reducing conflicts.
