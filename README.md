# StudentEmail-LinkedList

### *Team Members*

- Asel Esra Ozyilmaz
- Selma Nezihoglu

## Project Description

We have created a basic Student GUI with java which generates emails for students.
When users enter an id and a name for a student the app creates an email for the specified student then writes it in a linked list. If needed, users can delete and edit students informations
with the help of buttons. 

` Java code in order to create a linked list; `

``` Java
    private LinkedList<StudentEmail> studentLList = new LinkedList<StudentEmail>(); //to display student info in a linked list
``` 

<img src="https://user-images.githubusercontent.com/64264345/117555265-990c7e00-b07f-11eb-9631-4fccc2776221.jpg" width="550"> 

- ***Save button is disabled until edit button is used because we can't save a data before editing it.***

> ### The Use Of Buttons

### Test Button;

When clicked on, data which had beed provided when program was written will appear on the linked list. This will help the user to test other buttons such as, edit, save and delete.

<img src="https://user-images.githubusercontent.com/64264345/117555267-9a3dab00-b07f-11eb-9831-ec6e46851455.jpg" width="450">

### Delete Button;

If the user wants to delete a data from the linked list, first he/she has to provide the id of the unwanted student in the id text field then click on the delete button. Record will be eliminated after using the delete button.

![SLL2](https://user-images.githubusercontent.com/64264345/117555280-a6c20380-b07f-11eb-8840-b44941f9f160.jpg) ![SLL3](https://user-images.githubusercontent.com/64264345/117555281-a75a9a00-b07f-11eb-8555-da7998e752e5.jpg)

### Edit Button;

If the user has entered false information of a student, the user can change it by the edit button. He/she has to specify the id of the student where changes are going to be made, after clicking on edit button, student's name of the specified id will appear on the name text field.

![SLL4](https://user-images.githubusercontent.com/64264345/117555272-a45fa980-b07f-11eb-8a91-ba55b2759fa1.jpg) ![SLL5](https://user-images.githubusercontent.com/64264345/117555274-a4f84000-b07f-11eb-9445-0fff4851b8a5.jpg)

### Save Button;

If edit button is used, save button will be enabled in order to save the changes which have been made. 

![SLL6](https://user-images.githubusercontent.com/64264345/117555276-a590d680-b07f-11eb-819d-19f49b71f793.jpg) ![SLL7](https://user-images.githubusercontent.com/64264345/117555277-a6296d00-b07f-11eb-926a-1987724ef8ff.jpg)

### Add Button;

If the user wants to add extra students, after providing an id and a name he/she can add a student to the linked list by clicking on the add button.

![SLL8](https://user-images.githubusercontent.com/64264345/117555278-a6296d00-b07f-11eb-841b-3273aa72a319.jpg) ![SLL9](https://user-images.githubusercontent.com/64264345/117555279-a6c20380-b07f-11eb-826c-142b07bef080.jpg)

