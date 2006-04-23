/*
 * jcaptcha, the open source java framework for captcha definition and integration
 * Copyright (c) 2005 jcaptcha.net. All Rights Reserved.
 * See the LICENSE.txt file distributed with this package.
 */
package com.octo.captcha.service.sound;

import com.octo.captcha.service.CaptchaService;
import com.octo.captcha.service.CaptchaServiceException;

import javax.sound.sampled.AudioInputStream;
import java.util.Locale;

/**
 * @author <a href="mailto:marc.antoine.garrigue@gmail.com">Marc-Antoine Garrigue</a>
 * @version 1.0
 */
public interface SoundCaptchaService extends CaptchaService {
    /**
     * Method to retrive the sound challenge corresponding to the given ticket.
     *
     * @param ID the ticket
     *
     * @return the challenge
     *
     * @throws com.octo.captcha.service.CaptchaServiceException
     *          if the ticket is invalid
     */
    AudioInputStream getSoundChallengeForID(String ID) throws CaptchaServiceException;

    /**
     * Method to retrive the sound challenge corresponding to the given ticket.
     *
     * @param ID the ticket
     *
     * @return the challenge
     *
     * @throws com.octo.captcha.service.CaptchaServiceException
     *          if the ticket is invalid
     */
    AudioInputStream getSoundChallengeForID(String ID, Locale locale) throws CaptchaServiceException;

}
