package com.github.jjfhj.tests;

import org.junit.jupiter.api.Test;

import static com.github.jjfhj.tests.TestData.*;

public class StudentRegistrationForm extends TestBase {

    @Test
    void fillFormTest() {
        registrationsPage.openPage()
                //Заполнить форму регистрации "Student Registration Form"
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(email)
                .selectGender(gender)
                .typeNumber(mobileNumber)
                .setDate(day, month, year)
                .typeSubjects(subject)
                .selectHobbies(hobby1)
                .selectHobbies(hobby2)
                .uploadFile(fileName)
                .typeCurrentAddress(address)
                .selectState(state)
                .selectCity(city)
                .clickSubmit()
                //Проверить всплывающее модальное окно "Thanks for submitting the form" после успешной отправки формы
                .checkModalFormTitle()
                .checkModalFormValue("Student Name", firstName + " " + lastName)
                .checkModalFormValue("Student Email", email)
                .checkModalFormValue("Gender", gender)
                .checkModalFormValue("Mobile", mobileNumber)
                .checkModalFormValue("Date of Birth", day + " " + month + "," + year)
                .checkModalFormValue("Subjects", subject)
                .checkModalFormValue("Hobbies", hobby1 + ", " + hobby2)
                .checkModalFormValue("Picture", fileName)
                .checkModalFormValue("Address", address)
                .checkModalFormValue("State and City", state + " " + city);
    }
}
