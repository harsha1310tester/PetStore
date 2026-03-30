package api.endpoints;

//base URL Base URL: petstore.swagger.io/v2
public class routes
{
    public static String base_url = "https://petstore.swagger.io/v2";

    //API endpoints
    //user module
    public static String post_url = base_url + "/users";
    public static String get_url = base_url + "/users/{username}";
    public static String put_url = base_url + "/users/{username}";
    public static String delete_url = base_url + "/users/{username}";

    //pet module
    public static String post_url_pet = base_url + "/pet";
    public static String get_url_pet = base_url + "/pet/{petId}";
    public static String put_url_pet = base_url + "/pet";
    public static String delete_url_pet = base_url + "/pet/{petId}";

    //store module
    public static String post_url_store = base_url + "/store/order";
    public static String get_url_store = base_url + "/store/order/{orderId}";
    public static String delete_url_store = base_url + "/store/order/{orderId}";
    public static String get_url_store_inventory = base_url + "/store/inventory";

}
