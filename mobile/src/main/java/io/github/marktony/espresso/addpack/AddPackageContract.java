package io.github.marktony.espresso.addpack;

import io.github.marktony.espresso.BasePresenter;
import io.github.marktony.espresso.BaseView;

/**
 * Created by lizhaotailang on 2017/2/10.
 */

public interface AddPackageContract {

    interface View extends BaseView<Presenter> {

        void showAddingNumberError();

        void showNumberError();

    }

    interface Presenter extends BasePresenter {

        void addNumber(String number, String name);

    }

}
