package racingcar.Service;

import racingcar.Model.Car;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class UserInput {    //사용자가 경주할 자동차 이름 입력 & 사용자가 시도할 횟수를 입력

    Car car = new Car();

    public void userInputCarName () throws IllegalAccessException{   //사용자가 경주할 자동차 이름 입력
        car.carName = readLine();
        String[] carList = car.carName.split(",");  //","으로 구분하여 입력
        for (int i = 0; i < carList.length; i++) {
            System.out.println(carList[i]); //차례대로 자동차 이름 출력
            if (car.carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5글자 이하로 입력바랍니다.");
            }
        }

    }

    public int tryNumber(int tryNumber) {   //사용자가 시도할 횟수를 입력
        car.tryNumber = Integer.parseInt(readLine());
        return car.tryNumber;
    }
}