/**
 * Create test data.
 */

print('dump start');

db.customer.update(
    {
        "_id": "demo"
    },
    {
        "_id": "demo",
        "name": "Hans Meier"
    },
    { upsert: true }
);

print('dump complete');