/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

import com.facebook.ads.sdk.*;
import java.io.File;
import java.util.Arrays;

public class SAMPLE_CODE {
  public static void main (String args[]) throws APIException {

    String access_token = "EAAdB0A7mkN4BAGaQkr1KNWqBw81VimAlBVgAhLH8ZAgIAo6oZA1TStTOPDbMC4oR5fTlhX1IlOhysaOmZCpowjo02HiolgcJonjCB9gQQyfzDLazOEujZAOAjcNJM0vQbOKLgP77ZA2CSdKkkTWuyNw3o0l3M9jpjghCLLMWR8QM5lRzHZAzJpBRGnTZAD2oCfER8Us11M6LPzNqmqewse5JFx8ddie5CAZD";
    String ad_account_id = "119156162238583";
    String app_secret = "b06df18d39ecd60324871812d5f8e631";
    String app_id = "2042686695968990";
    APIContext context = new APIContext(access_token).enableDebug(true);

    new AdAccount(ad_account_id, context).getInsights()
      .setLevel(AdsInsights.EnumLevel.VALUE_CAMPAIGN)
      .setFiltering("[]")
      .setBreakdowns(List<AdsInsights.EnumBreakdowns>.VALUE_["DAYS_7"])
      .setTimeRange("{\"since\":\"2018-01-18\",\"until\":\"2018-02-17\"}")
      .requestField("reach")
      .requestField("results")
      .requestField("result_rate")
      .requestField("frequency")
      .requestField("impressions")
      .requestField("delivery")
      .requestField("total_actions")
      .requestField("total_unique_actions")
      .requestField("relevance_score:score")
      .requestField("relevance_score:positive_feedback")
      .requestField("relevance_score:negative_feedback")
      .requestField("spend")
      .execute();
  }
}
