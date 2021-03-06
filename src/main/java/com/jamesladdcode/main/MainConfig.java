package com.jamesladdcode.main;

import com.jamesladdcode.CommandLineArguments;
import com.jamesladdcode.service.Service;
import dagger.*;

@Component(modules = MainModule.class)
public interface MainConfig {

    Service service();

    @Component.Builder
    interface Builder {
        @BindsInstance Builder arguments(CommandLineArguments arguments);
        MainConfig build();
    }
}

