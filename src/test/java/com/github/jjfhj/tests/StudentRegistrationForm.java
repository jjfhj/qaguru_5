package com.github.jjfhj.tests;

import org.junit.jupiter.api.Test;

public class StudentRegistrationForm extends TestBase {

    @Test
    void fillFormTest() {
        registrationsPage.openPage()
                //Заполнить форму регистрации "Student Registration Form"
                .typeFirstName("Carol")
                .typeLastName("Delmonte")
                .typeEmail("CarolBDelmonte@armyspy.com")
                .selectGender("Male")
                .typeNumber("8165059611")
                .setDate("16", "August", "1988")
                .typeSubjects("Hindi")
                .selectHobbies("Reading")
                .selectHobbies("Music")
                .uploadFile("Duck_on_Yeadon_Tarn.jpg")
                .typeCurrentAddress("4959 Tree Frog Lane\n" + "Kansas City, MO 64151")
                .selectState("Haryana")
                .selectCity("Panipat")
                .clickSubmit()
                //Проверить всплывающее модальное окно "Thanks for submitting the form" после успешной отправки формы
                .checkModalFormTitle()
                .checkModalFormValue("Student Name", "Carol Delmonte")
                .checkModalFormValue("Student Email", "CarolBDelmonte@armyspy.com")
                .checkModalFormValue("Gender", "Male")
                .checkModalFormValue("Mobile", "8165059611")
                .checkModalFormValue("Date of Birth", "16 August,1988")
                .checkModalFormValue("Subjects", "Hindi")
                .checkModalFormValue("Hobbies", "Reading, Music")
                .checkModalFormValue("Picture", "Duck_on_Yeadon_Tarn.jpg")
                .checkModalFormValue("Address", "4959 Tree Frog Lane\n" + "Kansas City, MO 64151")
                .checkModalFormValue("State and City", "Haryana Panipat");
    }
}
