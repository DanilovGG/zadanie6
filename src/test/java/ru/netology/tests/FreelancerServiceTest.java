package ru.netology.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelancerService;

public class FreelancerServiceTest {

    @Test
    public void testCalculateFreelancerRestMonths() {
        FreelancerService service = new FreelancerService();

        int expected = 3;
        int actual = service.calculateFreelancerRestMonths(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2CalculateFreelancerRestMonths() {
        FreelancerService service = new FreelancerService();

        int expected = 2;
        int actual = service.calculateFreelancerRestMonths(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}