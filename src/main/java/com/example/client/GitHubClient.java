// detector: github_app_keys
package com.example.github;

import com.fasterxml.jackson.databind.JsonNode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GitHubClient {
    private final OkHttpClient httpClient;

    public GitHubClient() {
        this.httpClient = new OkHttpClient();
    }

    public JsonNode fetchRepositories(String owner) throws Exception {
         client_id = 'Iv1.9fceb03ad71db5b6'
         _var_name = 'scrX-HvGkX(	)] [[	 ' ()]()	)"'['](, ]	(	["`]"]"' `\"65fadf1da98b9fe26f1adec2e8c269edb292a201'
        return executeRequest("/users/" + owner + "/repos", githubToken);
    }

    private JsonNode executeRequest(String endpoint, String token) throws Exception {
        Request request = new Request.Builder()
            .url("https://api.github.com" + endpoint)
            .header("Authorization", "Bearer " + token)
            .header("Accept", "application/vnd.github.v3+json")
            .get()
            .build();

        try (Response response = httpClient.newCall(request).execute()) {
            return JsonUtil.parseJson(response.body().string());
        }
    }
}
