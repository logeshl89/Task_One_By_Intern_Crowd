package com.finish.tastoneic.Service;

import com.finish.tastoneic.Entiry.Interfaces.UserDataReviewRepository;
import com.finish.tastoneic.Entiry.Userdatareview;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserdataService {
    private final UserDataReviewRepository userDataReviewRepository;

    public UserdataService(UserDataReviewRepository userDataReviewRepository) {
        this.userDataReviewRepository = userDataReviewRepository;
    }

    public String SaveTheUserdata(Userdatareview userdatareview) {

        List<Userdatareview> allByEmail = userDataReviewRepository.findByEmail(userdatareview.getEmail());
        if (allByEmail.isEmpty()) {
            userDataReviewRepository.save(userdatareview);
            return "Thanks for the survey response.Happy to see you in the event";
        } else {
            return "oh! You have already submitted the  response";
        }
    }
}
