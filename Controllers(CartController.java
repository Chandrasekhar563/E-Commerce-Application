@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping
    public CartItem addToCart(@RequestBody CartItem item) {
        return service.addToCart(item);
    }

    @GetMapping
    public List<CartItem> viewCart() {
        return service.getCartItems();
    }
}
